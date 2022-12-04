dependencies {
	implementation(project(":client"))
	implementation("org.springframework.boot:spring-boot-starter-web")

	//Circuit Breaker
	implementation("io.github.resilience4j:resilience4j-spring-boot2:1.7.0")

	//kotlin-logging
	implementation("io.github.microutils:kotlin-logging-jvm:2.0.10")
	implementation("org.slf4j:slf4j-api:1.7.30")
}

dependencyManagement {
	imports {
		mavenBom("org.springframework.cloud:spring-cloud-dependencies:2021.0.1")
	}
}