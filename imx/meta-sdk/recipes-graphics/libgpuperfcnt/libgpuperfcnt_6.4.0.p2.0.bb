DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

SRC_URI[arm-fb.md5sum] = "aa7c0d0e088a86c6a713d06433e3e1ba"
SRC_URI[arm-fb.sha256sum] = "908611dc693f5c6482e2d1e62508fda18f99e03867d29f10bc2a855c862298f7"

SRC_URI[arm-wayland.md5sum] = "4c864c39d47d46dfbd028f91a6c9bbd4"
SRC_URI[arm-wayland.sha256sum] = "73e6780294d1bd750b2062e13a814ec207ac16e8ae96f61de9a0fb27c354f516"

SRC_URI[arm-x11.md5sum] = "eaab2c7988fb7c2fed8e6a7fab4943af"
SRC_URI[arm-x11.sha256sum] = "0146482ba91a4e72f13fa10d7cec22dca92ef55d61f0ba09f2fedcfa6e7b319d"

SRC_URI[aarch64-fb.md5sum] = "1bc3e825218614c4fd7bee0cf1059034"
SRC_URI[aarch64-fb.sha256sum] = "f2c7985dc09744cfdab152d53cc500e74b5e6f2f9764dbcf9795def1aec1dcf1"

SRC_URI[aarch64-wayland.md5sum] = "2910aeccdc919ed83c049eb6e82e3216"
SRC_URI[aarch64-wayland.sha256sum] = "01b8d3d4a1225c7c170ae8725e2f237892c6ed736c8d5351c4f47c08f8086f6c"

SRC_URI[aarch64-x11.md5sum] = "820f7950384a3d632b48a1de7796b846"
SRC_URI[aarch64-x11.sha256sum] = "515cea9aa03ac4c046f284eb6f740e739efb77e8808d3fd91fad3e5a39af6731"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
