import scala.util.control._

object Numbers {
	def main(args: Array[String]){
		println("fib:")
		fib(args(0).toInt)
		println("\npi:")
		pi(args(0).toInt)
		println()
	}

	def fib(limit: Int) {
		var first = 1
		var second = 1
		var index = 0
		for(index <- 1 to limit){
			if(index == 1){
				print(first+" ")
			}
			else if(index == 2){
				print(second+" ")
			}
			else{
				second = first + second
				first = second - first
				print(second+" ")
			}
		}
	}

	def pi(limit: Int) {
		var numerator = 22
		var denominator = 7
		var dividend = 0.0
		var scale = 1
		var decimals = 0

		var loop = new Breaks
		loop.breakable{
			do{
				while(numerator >= denominator){
					dividend += 1 / scale
					numerator -= denominator
				}

				scale *= 10
				numerator *= 10
				decimals += 1

				println(decimals+" "+limit)
				if(decimals > limit){
					loop.break
				}
			}
			while(numerator != 0)
		}

		print(dividend)
	}
}
