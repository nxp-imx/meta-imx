# Copyright (C) 2017-2021 NXP

SUMMARY = "OPTEE Client libs"
HOMEPAGE = "http://www.optee.org/"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=69663ab153298557a59c67a60a743e5b"

SRCBRANCH = "lf-5.15.5_1.0.0"
OPTEE_CLIENT_SRC ?= "git://source.codeaurora.org/external/imx/imx-optee-client.git;protocol=https"
SRC_URI = " \
    ${OPTEE_CLIENT_SRC};branch=${SRCBRANCH} \
    file://tee-supplicant.service \
"
SRCREV = "182874320395787a389e5b0f7df02b32f3c0a1b0"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"

inherit python3native systemd features_check

REQUIRED_MACHINE_FEATURES = "optee"

SYSTEMD_SERVICE:${PN} = "tee-supplicant.service"

OPTEE_ARCH ?= "arm32"
OPTEE_ARCH:armv7a = "arm32"
OPTEE_ARCH:aarch64 = "arm64"

EXTRA_OEMAKE = "ARCH=${OPTEE_ARCH} -C ${S} O=${B}"

do_install () {
	oe_runmake install

	install -D -p -m0644 ${B}/export/usr/lib/libteec.so.1.0.0 ${D}${libdir}/libteec.so.1.0.0
	ln -sf libteec.so.1.0.0 ${D}${libdir}/libteec.so.1
	ln -sf libteec.so.1.0.0 ${D}${libdir}/libteec.so

	install -D -p -m0644 ${B}/export/usr/lib/libckteec.so.0.1.0 ${D}${libdir}/libckteec.so.0.1.0
	ln -sf libckteec.so.0.1.0 ${D}${libdir}/libckteec.so.0
	ln -sf libckteec.so.0.1.0 ${D}${libdir}/libckteec.so

	install -D -p -m0755 ${B}/export/usr/sbin/tee-supplicant ${D}${bindir}/tee-supplicant

	cp -a ${B}/export/usr/include ${D}${includedir}

	sed -i -e s:/etc:${sysconfdir}:g -e s:/usr/bin:${bindir}:g ${WORKDIR}/tee-supplicant.service
	install -D -p -m0644 ${WORKDIR}/tee-supplicant.service ${D}${systemd_system_unitdir}/tee-supplicant.service
}

PACKAGES += "tee-supplicant"
FILES:${PN} += "${libdir}/* ${includedir}/*"
FILES:tee-supplicant += "${bindir}/tee-supplicant"

INSANE_SKIP:${PN} = "ldflags dev-elf"
INSANE_SKIP:${PN}-dev = "ldflags dev-elf"
INSANE_SKIP:tee-supplicant = "ldflags"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
