param(
    [ValidateSet('todas', '1', '2', '3')]
    [string]$Atividade = 'todas'
)

$ErrorActionPreference = 'Stop'
$OutputEncoding = [System.Text.UTF8Encoding]::new($false)
[Console]::OutputEncoding = [System.Text.UTF8Encoding]::new($false)

$pastaFontes = Join-Path $PSScriptRoot 'src'
$pastaSaida = Join-Path $PSScriptRoot 'out'
$fontes = @(Get-ChildItem -LiteralPath $pastaFontes -Recurse -Filter '*.java' |
    ForEach-Object { $_.FullName })

New-Item -ItemType Directory -Path $pastaSaida -Force | Out-Null
& javac -encoding UTF-8 -d $pastaSaida $fontes
if ($LASTEXITCODE -ne 0) {
    throw 'Não foi possível compilar as atividades. Verifique se o JDK está instalado.'
}

$classes = [ordered]@{
    '1' = 'atividade1.abstractfactory.Main'
    '2' = 'atividade2.adapter.Main'
    '3' = 'atividade3.builder.Main'
}

foreach ($numero in $classes.Keys) {
    if ($Atividade -eq 'todas' -or $Atividade -eq $numero) {
        Write-Host "=== Atividade $numero ==="
        & java '-Dfile.encoding=UTF-8' -cp $pastaSaida $classes[$numero]
        if ($LASTEXITCODE -ne 0) {
            throw "Falha ao executar a atividade $numero."
        }
        Write-Host ''
    }
}
