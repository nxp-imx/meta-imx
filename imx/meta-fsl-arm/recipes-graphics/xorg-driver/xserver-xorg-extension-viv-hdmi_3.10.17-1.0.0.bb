# Copyright (C) 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)
DESCRIPTION = "Freescale Extension for HDMI performance"
LICENSE = "MIT-X"

DEPENDS += "virtual/kernel xf86-video-imxfb-vivante"

LIC_FILES_CHKSUM = "file://EXA/src/vivante_fbdev/vivante.h;endline=19;md5=641ac6e6d013833e36290797f4d7089c"

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz"
S="${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"

SRC_URI[md5sum] = "f494f8862a016cba315795b061a338ea"
SRC_URI[sha256sum] = "5470308eaabedb5585bbf02e4117a421ec8e8951e4033e9e1afa387937b3a5f9"

inherit autotools pkgconfig

EXTRA_OEMAKE += "-f makefile.linux prefix=${D}/usr \
                 sysroot=${STAGING_DIR_TARGET} \
                 BUSID_HAS_NUMBER=1 \
                 BUILD_IN_YOCTO=1 \
                 XSERVER_GREATER_THAN_13=1"


CFLAGS += "-I${STAGING_INCDIR}/xorg \
           -I${STAGING_INCDIR}/drm \
           -I../../DRI_1.10.4/src"

# FIXME: The Freescale provided Makefile has hardcodec include paths
#        and this does not work in case prefix is different than /usr,
#        sed it.
do_configure_prepend () {
    sed -i 's,$(sysroot)/usr/include,${STAGING_INCDIR},g' \
            ${S}FslExt/src/makefile.linux
}

# FIXME: This is need as Freescale didn't use standard Makefile filename
#        thus oe_runmame thinks nothing is need to be done, use ln to
#        workaround it.
base_do_compile () {
    oe_runmake || die "make failed"
}
do_compile () {
    cd FslExt/src
    oe_runmake
    install -d ${D}${libdir}
    cd ../../util/autohdmi
    oe_runmake
}


do_install () {
    install -d ${D}${libdir}
    cp -axr ${S}/FslExt/src/libfsl_x11_ext.so ${D}${libdir}

    install -d ${D}${exec_prefix}/sbin
    cp -axr ${S}/util/autohdmi/autohdmi ${D}${exec_prefix}/sbin
}

RDEPENDS_${PN} += "libvivante-dri-mx6 \
                   xserver-xorg-module-exa \
                   mesa-driver-swrast \
                   xserver-xorg-extension-dri \
                   xserver-xorg-extension-dri2 \
                   xserver-xorg-extension-glx"

REALSOLIBS := "${SOLIBS}"
SOLIBS = "${SOLIBSDEV}"

FILES_${PN} = " ${libdir}/libfsl_x11_ext${SOLIBS} ${exec_prefix}/sbin/autohdmi "
#FILES_${PN}-dbg = "${libdir}/.debug/ "
#FILES_${PN}-dbg += "${exec_prefix}/sbin/.debug/"

PACKAGE_ARCH = "${MACHINE_SOCARCH}"
COMPATIBLE_MACHINE = "(mx6)"