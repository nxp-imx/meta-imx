DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[arm-fb.md5sum] = "2d106ed1e59f4c45623eca495809bb77"
SRC_URI[arm-fb.sha256sum] = "db96178c51dd50f449e761367e6145fc1fba12db162ba76e7dfc9e9e6e45a29b"

SRC_URI[arm-wayland.md5sum] = "cc68352432436c2e8ccab356ad45651d"
SRC_URI[arm-wayland.sha256sum] = "0926de3289e1ebe953187ea6729e30399c6c423fc6361d16f47443732678fe10"

SRC_URI[arm-x11.md5sum] = "7bb16edfe15f8196418ecc24ce327c71"
SRC_URI[arm-x11.sha256sum] = "b05c685a24cfb520940766bf2337466f6ddc9a5f59a3d01b9fb21038051031fd"

SRC_URI[aarch64-fb.md5sum] = "419fc51accdcde75369ffeafcc7f4024"
SRC_URI[aarch64-fb.sha256sum] = "8db0c98d3a07d23f39819d7a7c5932032aacc34785bdb37acfff5f079c159b98"

SRC_URI[aarch64-wayland.md5sum] = "c5497b6b7a5bc6f82ccbc34c517094fb"
SRC_URI[aarch64-wayland.sha256sum] = "33439b3475d2704b7ed9c6b0afd46dedcfe7361a00dbc2a44f12d46f2d3f89bf"

SRC_URI[aarch64-x11.md5sum] = "39ae71b3edeb0a96dce9a815a84243b5"
SRC_URI[aarch64-x11.sha256sum] = "73ba7d19e5a249c20c043d263858812b6f493c8afb712fb21cd2dec051c121fc"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

do_install_append () {
    # replace .so with symlink
    rm ${D}${libdir}/libgpuperfcnt.so
    ln -s libgpuperfcnt.so.0 ${D}${libdir}/libgpuperfcnt.so
}

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
