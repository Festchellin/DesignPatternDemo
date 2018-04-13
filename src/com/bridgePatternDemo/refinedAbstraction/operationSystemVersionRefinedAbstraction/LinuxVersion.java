package com.bridgePatternDemo.refinedAbstraction.operationSystemVersionRefinedAbstraction;

import com.bridgePatternDemo.abstraction.OperationSystemVersion;

public class LinuxVersion extends OperationSystemVersion {
    private static String osType = "Linux Operation System";

    @Override
    public void play(String fileName) {
        videoFile.decode(osType, fileName);
    }
}
