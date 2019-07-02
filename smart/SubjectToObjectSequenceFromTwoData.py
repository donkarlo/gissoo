
'''@todo favoring sentences in corpora that 
use figures of speech'''
class SubjectToObjectEventSequenceFromTwoInputData
	corpus = null
	'''Subject of the sentence'''
	subject = null
	'''Object of the sentence'''
	obj = null
	'''sequence of events'''
	eventsSeq = ()
	
	def __init__(self,corpus,subject,obj):
		self.corpus = corpus
		self.subject = subject
		self.obj = obj

	'''Choose a sequence of sentences that 
	the object of one is the subject of the other'''
	def getARandomSeq(self):
		return eventsSeq
	
		


