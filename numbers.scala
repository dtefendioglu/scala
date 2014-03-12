object Numbers {
	def main(args: Array[String]){
		println("fib:")
		fib(args(0).toInt)
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
}
