plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "AulasKotlinEmAcao"
include("src:Aula")
findProject(":src:Aula")?.name = "Aula"
include("src:AulaExemplos")
findProject(":src:AulaExemplos")?.name = "AulaExemplos"
include("src:AulaArray")
findProject(":src:AulaArray")?.name = "AulaArray"
include("src:AulaCombinandoListas")
findProject(":src:AulaCombinandoListas")?.name = "AulaCombinandoListas"
include("src:AulaProgramacaoFuncional")
findProject(":src:AulaProgramacaoFuncional")?.name = "AulaProgramacaoFuncional"
include("src:AulaForLoop")
findProject(":src:AulaForLoop")?.name = "AulaForLoop"
include("src:AulaChaveValorComMaps")
findProject(":src:AulaChaveValorComMaps")?.name = "AulaChaveValorComMaps"
include("src:AulaClassAny")
findProject(":src:AulaClassAny")?.name = "AulaClassAny"
include("src:AulaExcecoes")
findProject(":src:AulaExcecoes")?.name = "AulaExcecoes"
include("src:AulaPolimorfismoInterfaces")
findProject(":src:AulaPolimorfismoInterfaces")?.name = "AulaPolimorfismoInterfaces"
include("src:AulaClassAbstrata")
findProject(":src:AulaClassAbstrata")?.name = "AulaClassAbstrata"
