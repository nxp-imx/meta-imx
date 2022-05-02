FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://icd_VSI.json \
    file://0001-CMakeLists.txt-Change-the-installation-path-of-JSON-.patch \
"

do_configure:append() {
    # WORKAROUND: Patch build.ninja so /usr/lib/librt.so is found in recipe-sysroot
    missing_lib=${libdir}/librt.so
    if ! grep "$missing_lib" build.ninja; then
        bbwarn "Library $missing_lib not found in ${B}/build.ninja. Please check if the recipe workaround is working and/or needed."
    elif ! grep " $missing_lib" build.ninja; then
        bbwarn "Library $missing_lib not found with absolute path in ${B}/build.ninja. Please check if the recipe workaround is working and/or needed."
    else
        bbnote "Work around configure problem by adding sysroot path to $missing_lib in $B/build.ninja"
        sed -i "s| $missing_lib| ${STAGING_DIR_HOST}$missing_lib|g" build.ninja
    fi
}

do_install:append () {
    install -d ${D}${sysconfdir}/vulkan/icd.d
    cp ${WORKDIR}/icd_VSI.json ${D}${sysconfdir}/vulkan/icd.d
    sed -i "s,/usr/lib,${libdir}," ${D}${sysconfdir}/vulkan/icd.d/icd_VSI.json
    sed -i "s,1.0.30,${PV}," ${D}${sysconfdir}/vulkan/icd.d/icd_VSI.json
}
