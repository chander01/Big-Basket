

class overlapDate():

	#Assigning the value for start and end
	start1,end1=('01-02-2017','05-03-2017')
	start2,end2=('04-10-2017','15-12-2017')
	start3,end3=('12-12-2017','18-12-2017')


	def __init__(self):
		#parsing the value by '-' and assinging into an list/array
		self.s1=overlapDate.start1.split('-')
		self.e1=overlapDate.end1.split('-')
		self.s2=overlapDate.start2.split('-')
		self.e2=overlapDate.end2.split('-')
		self.s3=overlapDate.start3.split('-')
		self.e3=overlapDate.end3.split('-')

		
	def checkoverlap(self):
		#Comparing day / month / year between three data range
		if((int(self.e1[2]) >= int(self.s2[2])) and (int(self.e1[1]) >= int(self.s2[1])) and (int(self.e1[0]) >= int(self.s2[0]))):
			print("(",overlapDate.start1,"),(",overlapDate.end1,") Overlap with (",overlapDate.start2,"),(",overlapDate.end2,")")
		elif((int(self.e2[2]) >= int(self.s3[2])) and (int(self.e2[1]) >= int(self.s3[1])) and (int(self.e2[0]) >= int(self.s3[0]))):
			print("(",overlapDate.start1,"),(",overlapDate.end1,") Overlap with (",overlapDate.start2,"),(",overlapDate.end2,")")
		elif((int(self.e1[2]) >= int(self.s3[2])) and (int(self.e1[1]) >= int(self.s3[1])) and (int(self.e1[0]) >= int(self.s3[0]))):
			print("(",overlapDate.start1,"),(",overlapDate.end1,") Overlap with (",overlapDate.start3,"),(",overlapDate.end3,")")
		else:
			print("No date overlap")

v = overlapDate()
v.checkoverlap()

