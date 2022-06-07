package zup.com.hello

import io.micronaut.http.HttpResponse
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Header
import java.time.LocalDate
import java.time.ZoneId

@Controller("/api/v1/hello")
class HelloController {

    @Get("/world")
    fun helloWorld(@Header("name") name: String, @Header("lastName") lastName: String): MutableHttpResponse<String> {
        val dayOfWeek = LocalDate.now(ZoneId.of("America/Sao_Paulo")).dayOfWeek.name.lowercase()
        return HttpResponse.ok("Hello $lastName, $name!!! Today is $dayOfWeek.")
    }

}