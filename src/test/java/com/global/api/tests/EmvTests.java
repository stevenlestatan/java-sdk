package com.global.api.tests;

import com.global.api.utils.EmvData;
import com.global.api.utils.EmvUtils;
import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class EmvTests {
    @Test
    public void parseTagData() {
        String tagData = "4f07a0000000041010500a4d61737465724361726457135413330089010434d22122019882803290000f5a085413330089010434820238008407a00000000410108e0a00000000000000001f00950500008080009a031901099b02e8009c01405f201a546573742f4361726420313020202020202020202020202020205f24032212315f25030401015f2a0208405f300202015f3401009f01060000000000019f02060000000006009f03060000000000009f0607a00000000410109f0702ff009f090200029f0d05b8508000009f0e0500000000009f0f05b8708098009f10120110a0800f22000065c800000000000000ff9f120a4d6173746572436172649f160f3132333435363738393031323334359f1a0208409f1c0831313232333334349f1e0831323334353637389f21030710109f26080631450565a30b759f2701809f330360f0c89f34033f00019f3501219f360200049f3704c6b1a04f9f3901059f4005f000a0b0019f4104000000869f4c0865c862608a23945a9f4e0d54657374204d65726368616e74";

        EmvData emvData = EmvUtils.parseTagData(tagData, true);
        assertNull(emvData.getTag("57"));
        assertNull(emvData.getTag("5A"));
        assertNull(emvData.getTag("5F20"));
        assertNull(emvData.getTag("5F24"));
        assertTrue(emvData.getAcceptedTagData().length() <= 512);
    }
}