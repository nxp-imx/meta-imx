# Copyright (C) 2019-2021 NXP

SUMMARY = "Test program for v2x adaptation layer v2xhsm"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://BSD-3-Clause.txt;md5=664939843ae3416d811479b21978e8b4"

DEPENDS = "ecdsa-lib-imx v2xsehsm openssl"

SRCBRANCH = "imx_5.4.70_2.3.4"
VTEST_SRC ?= "git://source.codeaurora.org/external/imx/vtest.git;protocol=ssh"
SRC_URI = "${VTEST_SRC};branch=${SRCBRANCH} \
    file://seco_nvm_daemon.service \
    file://0001-Ignore-v2xsehsmConfig.cmake.patch \
"
SRCREV = "1df2cf992f0545a7710fed6583912de58eb87934"

S = "${WORKDIR}/git"

inherit systemd cmake

PACKAGECONFIG ?= ""
PACKAGECONFIG[lttng] = "-DLTTNG_LIB=${STAGING_DIR_TARGET}${libdir}/liblttng-ust.so,,lttng-ust"

SYSTEMD_SERVICE_${PN} = "seco_nvm_daemon.service"

EXTRA_OECMAKE += " \
    -DSECO_LIBS_DIR=${STAGING_DIR_TARGET}${libdir} \
    -DZLIB_DIR=${STAGING_DIR_TARGET}${libdir} \
    -DECC_SRC=${STAGING_DIR_TARGET}${libdir} \
"

do_install_append() {
    install -d  ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/seco_nvm_daemon.service ${D}${systemd_system_unitdir}
}

COMPATIBLE_MACHINE = "(mx8dxl)"
