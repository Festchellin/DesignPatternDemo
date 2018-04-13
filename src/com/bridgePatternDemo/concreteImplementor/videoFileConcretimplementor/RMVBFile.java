package com.bridgePatternDemo.concreteImplementor.videoFileConcretimplementor;

import com.bridgePatternDemo.implementor.VideoFile;

public class RMVBFile implements VideoFile {
    @Override
    public void decode(String osType, String fileName) {
        System.out.println("在" + osType + "上播放视频文件：" + fileName);
    }
}
