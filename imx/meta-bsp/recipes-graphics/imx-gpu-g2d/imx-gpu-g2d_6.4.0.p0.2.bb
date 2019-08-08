require recipes-graphics/imx-gpu-g2d/imx-gpu-g2d_6.2.4.p1.8.bb

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3" 

FSLBIN_NAME_arm = "${PN}-${PV}-${TARGET_ARCH}"

SRC_URI[aarch64.md5sum] = "49093b4ee57cda98d8e528a2c18398e5"
SRC_URI[aarch64.sha256sum] = "ace7c70bf42e6ef05ee8129885613eb35067eb2ae9b85f25242e7052c6553eb4"
SRC_URI[arm.md5sum] = "8e00446f5b070ec50b6e9fd1ba7c4fa3"
SRC_URI[arm.sha256sum] = "8b51c634abe440d02fc2785513f2979a7451d81b63d6814d8f0a8e4d65adb09d"
