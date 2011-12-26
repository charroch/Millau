import com.novoda.js.JSEngine
import org.specs2.mutable._

class WebEngineSpec extends Specification {

  "A Javascript bridge" should {

    "return an integer against a script '1+1' " in {
     // new JSEngine().eval[java.lang.Integer]("1+1") must be_== 2
      "Hello world" must startWith("Hello")

    }

    "start with 'Hello'" in {
      "Hello world" must startWith("Hello")
    }

    "end with 'world'" in {
      "Hello world" must endWith("world")
    }

  }
}