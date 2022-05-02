package date_time

for(int i=0; i<10; i++){

	int epoch = System.currentTimeMillis()
	def val = String.valueOf(epoch)

	Thread.sleep(1000)
	println "$val"
}



