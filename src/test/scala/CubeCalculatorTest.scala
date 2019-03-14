class CubeCalculatorTest extends org.scalatest.FunSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27) 
  }
  test("CubeCalculator.cube0") {
    assert(CubeCalculator.cube(0) === 0)
  }
}