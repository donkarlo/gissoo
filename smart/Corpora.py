class Corpora
	def init(self,corpora):
	def getRandomUniqueEvent(self,spFarSelectedSentencces):
		sentence = null
		return sentence

	def getMostMatchingEventWithInData(self, eventsSoFar, inData):
	def geteObjectToSubjectEventSequenceFromTwoEntities(self,inData1,inData2):
			event1 = self.getMostMatchingEventWithInData1(self,inData1)
			event2 = self.getMostMatchingEventWithInData1(self,inData2)
			inEvents= (event1,event2)

			curEvent = chooseRandom(inEvents)

			inEvents.remove(curEvent)
			nextEvent = entities

			eventsSoFar = (curEvent,nextEvent)
			ner = new NamedEntityRecognition()
			while ner.getEntity(curEvent.getObject()) != ner.getEntity(nextEvent.getSubject())
				curEvent = nextEvent
				nextEvent = self.getRandomUniqueEvent(eventsSoFar)
				eventsSoFar.add(nextEvent)
			return eventsSoFar
