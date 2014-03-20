# Copyright (C) 2012-2014 Freescale Semiconductor
# Copyright (C) 2012-2013 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz"
S="${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"

SRC_URI[md5sum] = "f494f8862a016cba315795b061a338ea"
SRC_URI[sha256sum] = "5470308eaabedb5585bbf02e4117a421ec8e8951e4033e9e1afa387937b3a5f9"

do_install_append () {
	cp -axr ${S}/EXA/src/vivante_gal/vivante_gal.h ${D}${includedir}
	find ${D}${includedir} -type f -exec chmod 660 {} \;
}
