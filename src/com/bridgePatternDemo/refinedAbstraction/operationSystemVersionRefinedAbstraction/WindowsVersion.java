package com.bridgePatternDemo.refinedAbstraction.operationSystemVersionRefinedAbstraction;

import com.bridgePatternDemo.abstraction.OperationSystemVersion;

public class WindowsVersion extends OperationSystemVersion {
    private static String osType = "Windows Operation System";

    @Override
    public void play(String fileName) {
        videoFile.decode(osType, fileName);
    }
}
