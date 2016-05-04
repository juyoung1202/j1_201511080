package com.j2.wk9.party;

public class RemoteLoader {
 
    public static void main(String[] args) {
            RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

            Light livingRoomLight = new Light("Living Room");

            LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
            LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
 
            remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
            Mp3 mymp3 = new Mp3("my bag");
            Mp3PlayCommand onMp3 = new Mp3PlayCommand(mymp3);
            Mp3StopCommand offMp3 = new Mp3StopCommand(mymp3);
            remoteControl.setCommand(1,onMp3, offMp3);
            remoteControl.onButtonWasPushed(0);
            remoteControl.offButtonWasPushed(0);
            remoteControl.undoButtonWasPushed();
            remoteControl.offButtonWasPushed(0);
            remoteControl.onButtonWasPushed(0);
            remoteControl.undoButtonWasPushed();
            remoteControl.onButtonWasPushed(1);
    }
}