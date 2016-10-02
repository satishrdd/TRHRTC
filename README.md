##TRHRTC(Telepresence Robot System):
- The   primary   objective   of   our   TelePresence   Robot   System   is   to   aid   the   doctors   to  
remotely   monitor   in­patients   through   telepresence   robots   located   in   the   hospital.

#Technologies Used : 
- WEBRTC(PubNub API).
- Node.js
- Express Framework
- Mongo DB
- Socket.IO
- Android

#Implementation :
# Doctor App:
- Each doctor who would be using the application has to perform registration to access the application by providing their personal details.Once registered and verified a doctor can perform the login operation. 
- After the login the doctor would be redirected to the userHome page of the application. UserHome page is the basic crux of the application. Here a doctor could see all the other peers currently active (using the application and connected to the server.) In our current implementation each doctor could see all other peers currently active, where in these peers could be doctors as well as robots.
- However we could filter out the list of peers a doctor sees such that the peer list for a doctor comprises only active robots currently available.
- Once a peer is picked from the peer list available at the userHome page, a call is initiated to that peer.The two peers can communicate with each other through audio and video exchange. Each of the peer receives the remote audio and video stream as well as can see their own local stream.
- Using this chat window two peers can exchange textual data in the form of chat messages.Also when the call is established a steering is enabled in the application User Interface. Through these a peer can send steering action to a remote peer. This steering actions are communicated through the data channel of Web RTC API through which the regular chat messages are also exchanged.



# Robot App:
- Robot application is currently similar to the doctor application. This was intended so as to determine that any two random peers can communicate with each other. However we would identify a robot during the login procedure. Accordingly the interface at the robot side would not comprise of the steering wheel. Also it would not consist of the Patient Logs and the Call Logs. It would comprise of merely the views for displaying remote and local audio and video stream and a chat window in case a nurse or a patient wants to exchange chat messages with the doctor.


# Usage Instructions :





