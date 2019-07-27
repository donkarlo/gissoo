class Corpora
	def init(self,corpora):
	def getRandomUniqueEventBySubject(self,soFarChosenEvents,subject):
		sentence = null
		return sentence
	def getRandomSentences(self,numberOfSentences):

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
			
			'''todo: the final responsible of finding suj and obj of 
			sentence segments is DependencyParsing.py'''
			curObjEty = ner.getEntity(curEvent.getObject())
			curSbjEty = ner.getEntity(nextEvent.getSubject()

			etyCloseness = new EntityCloseness()
			etyClosenessTolerance = 0.01
			closeEnough = etyCloseness.closeEnough(curObjEty
				,curSbjEty
				,etyClosenessTolerance)

			while !closeEnough
				curEvent = nextEvent
				curObjEty = ner.getEntity(curEvent.getObject())
				nextEvent = self.getRandomUniqueEventBySubject(eventsSoFar
					,ner.getEntity(curObjEty))
				curObjEty = ner.getEntity(curEvent.getObject())
				curSbjEty = ner.getEntity(nextEvent.getSubject())
				closeEnough = etyCloseness.closeEnough(curObjEty
					,curSbjEty
					,etyClosenessTolerance)
				eventsSoFar.add(nextEvent)
		return eventsSoFar
