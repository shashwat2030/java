@RestController
class Helloworld {
    @RequestMapping("/")
    String sayHello() {
        return "Hello-World";
    }
}