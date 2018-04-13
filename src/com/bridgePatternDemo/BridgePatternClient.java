package com.bridgePatternDemo;

import com.bridgePatternDemo.abstraction.OperationSystemVersion;
import com.bridgePatternDemo.abstraction.Pen;
import com.bridgePatternDemo.concreteImplementor.colorConcreteImplementor.Black;
import com.bridgePatternDemo.concreteImplementor.videoFileConcretimplementor.AVIFile;
import com.bridgePatternDemo.implementor.Color;
import com.bridgePatternDemo.implementor.VideoFile;
import com.bridgePatternDemo.refinedAbstraction.operationSystemVersionRefinedAbstraction.MacintoshVersion;
import com.bridgePatternDemo.refinedAbstraction.penRefinedAbstraction.MiddlePen;

public class BridgePatternClient {
    public static void main(String[] args) {
        Color color = new Black();
        Pen pen = new MiddlePen();
        pen.setColor(color);
        pen.draw("鸭蛋");

        OperationSystemVersion operationSystem = new MacintoshVersion();
        VideoFile videoFile = new AVIFile();
        operationSystem.setVideoFile(videoFile);
        operationSystem.play("葫芦娃.avi");
    }
}
