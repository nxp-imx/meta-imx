SUMMARY = "Jailhouse"
HOMEPAGE = "https://github.com/siemens/jailhouse"
SECTION = "jailhouse"
LICENSE = "GPL-2.0 & BSD-2-Clause"

LIC_FILES_CHKSUM = "file://COPYING;md5=9fa7f895f96bde2d47fd5b7d95b6ba4d \
                 file://tools/root-cell-config.c.tmpl;beginline=6;endline=33;md5=2825581c1666c44a17955dc574cfbfb3 \
                 file://include/jailhouse/hypercall.h;beginline=9;endline=36;md5=2825581c1666c44a17955dc574cfbfb3 \
                 file://include/jailhouse/cell-config.h;beginline=9;endline=36;md5=2825581c1666c44a17955dc574cfbfb3 \
                 file://include/arch/arm/asm/jailhouse_hypercall.h;beginline=9;endline=36;md5=2825581c1666c44a17955dc574cfbfb3 \
                 file://include/arch/arm64/asm/jailhouse_hypercall.h;beginline=9;endline=36;md5=2825581c1666c44a17955dc574cfbfb3 \
                 file://include/arch/x86/asm/jailhouse_hypercall.h;beginline=9;endline=36;md5=2825581c1666c44a17955dc574cfbfb3 \
                 file://driver/jailhouse.h;beginline=9;endline=36;md5=2825581c1666c44a17955dc574cfbfb3"

DEPENDS = "virtual/kernel make-native python-mako-native dtc-native python-mako"

S ="${WORKDIR}/git"

require jailhouse-defs.inc
inherit module pythonnative bash-completion

JH_CONFIG ?= "${S}/ci/jailhouse-config-x86.h"
JH_CONFIG_x86 ?= "${S}/ci/jailhouse-config-x86.h"
JH_CONFIG_x86-64 ?= "${S}/ci/jailhouse-config-x86.h"
JH_CONFIG_arm ?= "${S}/ci/jailhouse-config-banana-pi.h"

do_configure() {
   if [ -d ${STAGING_DIR_HOST}/${CELLCONF_DIR} ]; 
   then
      cp "${STAGING_DIR_HOST}/${CELLCONF_DIR}/"*.c ${S}/configs/
   fi

   cp -av ${JH_CONFIG} ${S}/include/jailhouse/config.h
}

USER_SPACE_CFLAGS = '${CFLAGS} -DLIBEXECDIR=\\\"${libexecdir}\\\" \
		  -DJAILHOUSE_VERSION=\\\"$JAILHOUSE_VERSION\\\" \
		  -Wall -Wextra -Wmissing-declarations -Wmissing-prototypes -Werror \
		  -I../driver'

TOOLS_SRC_DIR = "${S}/tools"
TOOLS_OBJ_DIR = "${S}/tools"

do_compile() {
   oe_runmake V=0 \
        ARCH=${TARGET_ARCH} CROSS_COMPILE=${TARGET_PREFIX} \
        KDIR=${STAGING_KERNEL_BUILDDIR}

   cd ${TOOLS_SRC_DIR}
   export JAILHOUSE_VERSION=$(cat ../VERSION)
   oe_runmake V=0 \
   	       CFLAGS="${USER_SPACE_CFLAGS}" \
               src=${TOOLS_SRC_DIR} obj=${TOOLS_OBJ_DIR} \
	       ${TOOLS_OBJ_DIR}/jailhouse-config-collect ${TOOLS_OBJ_DIR}/jailhouse
}

do_install() {
    oe_runmake \
	       ARCH=${TARGET_ARCH} \
	       CROSS_COMPILE=${TARGET_PREFIX} \
	       KDIR=${STAGING_KERNEL_BUILDDIR} \
	       DESTDIR=${D} install

    install -d ${D}${CELL_DIR}
    install ${B}/configs/*.cell ${D}${CELL_DIR}/

    install -d ${D}${INMATES_DIR}
    install ${B}/inmates/demos/${JH_ARCH}/*.bin ${D}${INMATES_DIR}
}

PACKAGE_BEFORE_PN = "kernel-module-jailhouse"
FILES_${PN} = "${base_libdir}/firmware ${libexecdir} ${sbindir} ${JH_DATADIR}"

KERNEL_MODULE_AUTOLOAD += "jailhouse"

python __anonymous () {
    # Setup DEPENDS and RDEPENDS to included cells"
    cells = d.getVar('CELLS', True) or ""
    for cell in cells.split():
        d.appendVar('DEPENDS', ' ' + cell)
        d.appendVar('RDEPENDS_${PN}', ' ' + cell)
}
