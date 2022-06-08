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
    fun helloWorld(): MutableHttpResponse<String> {
        return HttpResponse.ok("Hello world.")
    }

}