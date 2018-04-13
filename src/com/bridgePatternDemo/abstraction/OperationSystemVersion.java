package com.bridgePatternDemo.abstraction;

import com.bridgePatternDemo.implementor.VideoFile;

public abstract class OperationSystemVersion {
    protected VideoFile videoFile;

    public void setVideoFile(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
