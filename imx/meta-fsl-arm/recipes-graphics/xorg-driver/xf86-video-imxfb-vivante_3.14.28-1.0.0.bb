# Copyright (C) 2012-2014 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xorg-driver-video.inc

PE = "3"

inherit autotools-brokensep update-rc.d pkgconfig

DEPENDS += "virtual/xserver virtual/libx11 virtual/libgal-x11 imx-gpu-viv pixman"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=19;md5=95cf961a2ceacdf7cf43caef25766779"

# FIXME: Drop 'alpha' suffix for GA release
SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi \
"

SRC_URI[md5sum] = "3e2a75360dacbf0db1d6d5417c4d9164"
SRC_URI[sha256sum] = "29f00e1d16eff6a1c8ef5052ba171116b68e180cf251378fd449a660c220e226"

INITSCRIPT_NAME = "rc.autohdmi"
INITSCRIPT_PARAMS = "start 99 2 3 4 5 ."

EXTRA_OEMAKE += "-C ${S} -d -f Makefile prefix=${D}/usr \
                 sysroot=${STAGING_DIR_TARGET} \
                 BUSID_HAS_NUMBER=1 \
                 BUILD_IN_YOCTO=1 \
                 XSERVER_GREATER_THAN_13=1"

CFLAGS += "-I${STAGING_INCDIR}/xorg \
           -I${STAGING_INCDIR}/drm \
           -I../../DRI_1.10.4/src"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"


PACKAGES =+ "xserver-xorg-extension-viv-hdmi xserver-xorg-extension-viv-hdmi-dev xserver-xorg-extension-viv-hdmi-dbg"

# FIXME: The Freescale provided Makefile has hardcodec include paths
#        and this does not work in case prefix is different than /usr,
#        sed it.
do_configure_prepend () {
    sed -i 's,$(sysroot)/usr/include,${STAGING_INCDIR},g' \
            ${S}EXA/src/makefile.linux
}

# FIXME: This is need as Freescale didn't use standard Makefile filename
#        thus oe_runmame thinks nothing is need to be done, use ln to
#        workaround it.
base_do_compile () {
    oe_runmake || die "make failed"
}

do_install_append () {
	install -d ${D}${includedir}
	cp -axr ${S}/EXA/src/vivante_gal/vivante_priv.h ${D}${includedir}
	cp -axr ${S}/EXA/src/vivante_gal/vivante_gal.h ${D}${includedir}

	install -d ${D}/${sysconfdir}/init.d
	install -m 755 ${WORKDIR}/rc.autohdmi ${D}/${sysconfdir}/init.d/rc.autohdmi

	find ${D}${includedir} -type f -exec chmod 660 {} \;
}

RDEPENDS_${PN} += "libvivante-dri-mx6 \
                   xserver-xorg-module-exa \
                   mesa-driver-swrast \
                   xserver-xorg-extension-dri \
                   xserver-xorg-extension-dri2 \
                   xserver-xorg-extension-glx"

REALSOLIBS := "${SOLIBS}"
SOLIBS = "${SOLIBSDEV}"

FILES_${PN} = "${libdir}/*/*/*/vivante_drv${SOLIBS}"
FILES_${PN}-dev = "${includedir} /usr/src"
FILES_${PN}-dbg = "${libdir}/*/*/*/.debug"

FILES_xserver-xorg-extension-viv-hdmi = " ${libdir}/libfsl_x11_ext${SOLIBS} ${exec_prefix}/bin/autohdmi ${sysconfdir}/init.d/rc.autohdmi"
FILES_xserver-xorg-extension-viv-hdmi-dev = " ${libdir}/libfsl_x11_ext${SOLIBSDEV}"
FILES_xserver-xorg-extension-viv-hdmi-dbg = " ${libdir}/.debug/libfsl_x11_ext${SOLIBS} ${exec_prefix}/bin/.debug/autohdmi"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(mx6)"
