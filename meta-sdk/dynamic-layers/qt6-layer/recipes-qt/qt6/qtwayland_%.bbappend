###Copy qtwayland bbappend from meta-freescale

# etnaviv mesa does not have glx
PACKAGECONFIG:remove:use-mainline-bsp = "xcomposite-glx"

PACKAGECONFIG:remove:mx6-nxp-bsp = "xcomposite-egl xcomposite-glx"
PACKAGECONFIG:remove:mx7-nxp-bsp = "xcomposite-egl xcomposite-glx"

# i.MX8 does never provide native x11, so required dependencies are not met
PACKAGECONFIG:remove:mx8-nxp-bsp = "xcomposite-egl xcomposite-glx"

###### End of meta-freescale bbappend

PACKAGECONFIG:remove:mx6sl-nxp-bsp = "wayland-egl"

do_install:append() {
if ls ${D}${libdir}/pkgconfig/Qt6*.pc >/dev/null 2>&1; then
    sed -i 's,-L${STAGING_DIR_HOST}/usr/lib,,' ${D}${libdir}/pkgconfig/Qt6*.pc
fi
}

