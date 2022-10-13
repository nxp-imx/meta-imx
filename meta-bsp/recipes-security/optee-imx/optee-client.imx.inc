# Copyright (C) 2017-2022 NXP

SUMMARY = "OPTEE Client libs"
HOMEPAGE = "http://www.optee.org/"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=69663ab153298557a59c67a60a743e5b"

OPTEE_CLIENT_SRC ?= "git://github.com/nxp-imx/imx-optee-client.git;protocol=https"
SRC_URI = " \
    ${OPTEE_CLIENT_SRC};branch=${SRCBRANCH} \
    file://tee-supplicant.service \
"

FILESEXTRAPATHS:append := ":${THISDIR}/optee-client"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"

inherit python3native systemd features_check pkgconfig

DEPENDS = "util-linux-libuuid"

REQUIRED_MACHINE_FEATURES = "optee"

SYSTEMD_SERVICE:${PN} = "tee-supplicant.service"

EXTRA_OEMAKE = " \
	-C ${S} O=${B} \
"

do_install () {
	oe_runmake install DESTDIR=${D}
	install -D -p -m0644 ${WORKDIR}/tee-supplicant.service ${D}${systemd_system_unitdir}/tee-supplicant.service
	sed -i \
		-e s:/etc:${sysconfdir}:g \
		-e s:/usr/sbin:${sbindir}:g \
		${D}${systemd_system_unitdir}/tee-supplicant.service
}

COMPATIBLE_MACHINE = "(imx-nxp-bsp)"
