# Copyright (C) 2020-2024 NXP
# Released under the MIT license (see COPYING.MIT for the terms)
# The recipe is licensed under MIT (see COPYING.MIT for the terms)

DESCRIPTION = "Sound Open Firmware with Zephyr"
HOMEPAGE = "https://www.sofproject.org"
SECTION = "kernel"
LICENSE = "Apache-2.0 & BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fa818a259cbed7ce8bc2a22d35a464fc \
                    file://LICENCE-sof;md5=14abb55d71048ebecff1a104640546b6 \
"
SRC_URI = "${FSL_MIRROR}/${BPN}-${PV}-${IMX_SRCREV_ABBREV}.tar.gz"
SRC_URI[sha256sum] = "ec553c2d48264460bfc240a668ffc385c980fd2e2076aa1c70c46614c52e8e8e"

IMX_SRCREV_ABBREV = "aea8101"

inherit allarch

do_install() {
    # Install firmware image 
    install -d ${D}${nonarch_base_libdir}/firmware/imx/sof-zephyr-gcc
    install -d ${D}${nonarch_base_libdir}/firmware/imx/sof-zephyr-xcc
    cp -r sof-zephyr-gcc/* ${D}${nonarch_base_libdir}/firmware/imx/sof-zephyr-gcc
    cp -r sof-zephyr-xcc/* ${D}${nonarch_base_libdir}/firmware/imx/sof-zephyr-xcc
    cp -r sof-tplg ${D}${nonarch_base_libdir}/firmware/imx/
    # Copy symbolic link
    if [ ${OEI_SOC} = "mx95" ]; then
       rm -rf sof
       ln -sf sof-zephyr-gcc sof
    fi
    cp -P sof  ${D}${nonarch_base_libdir}/firmware/imx/
}

FILES:${PN} = "${nonarch_base_libdir}/firmware/imx/sof*"
