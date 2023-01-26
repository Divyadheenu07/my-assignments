package day1;

public class Mobile {
public void sendMessage () {
	System.out.println("message sent");
}
public void shareDocument () {
	System.out.println("document shared");
}
public void call () {
	System.out.println("call attended by the reciever");
}
public void videoCall () {
	System.out.println("video call not attended by the reciever");
}
public void voiceMessage () {
	System.out.println("voice message sent");
}
public void mms () {
	System.out.println("mms recieved");
}
public void camera () {
	System.out.println("camera is available");
}
public void flashLight () {
	System.out.println("flashlight is on");
}
public void mic () {
	System.out.println("mic is working");
}
public void speaker () {
	System.out.println("speaker is not working");
}
public void deletedContacts () {
	System.out.println("contacts are deleted");
}
public static void main(String[] args) {
	Mobile object = new Mobile() ;
	object.sendMessage();
	object.shareDocument();
	object.call();
	object.videoCall();
	object.mms();
	object.voiceMessage();
	object.deletedContacts();
	object.flashLight();
	object.camera();
	object.mic();
	object.speaker();
}
}
