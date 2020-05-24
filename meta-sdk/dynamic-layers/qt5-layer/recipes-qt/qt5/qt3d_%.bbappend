PACKAGECONFIG_append_class-target = " examples"

do_install_append() {
if ls ${D}${libdir}/pkgconfig/Qt5*.pc >/dev/null 2>&1; then
    sed -i 's,-L${STAGING_DIR_HOST}/usr/lib,,' ${D}${libdir}/pkgconfig/Qt5*.pc
fi
}
# Update the commit to fix qt3d race condition issues
SRCREV = "37735f11f9437b916b194cfd48c452c7c70682f8"
