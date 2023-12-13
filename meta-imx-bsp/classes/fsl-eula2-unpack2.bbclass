# fsl-eula-unpack2.bbclass provides a mechanism for a) unpacking certain
# EULA-licensed archives downloaded by HTTP and b) handling the EULA
# acceptance.

inherit fsl-eula-unpack fsl-eula2

IMX_PACKAGE_VERSION = "${PV}"

SRC_URI = "${NXP_BASE_URL}/${IMX_PACKAGE_NAME}.bin;fsl-eula=true"
NXP_BASE_URL ??= "${FSL_MIRROR}"

S = "${WORKDIR}/${IMX_PACKAGE_NAME}"

# For native apps, insert the user-local sysroot path
# For nativesdk apps, insert the correct distro folder
D_SUBDIR                 = ""
D_SUBDIR:class-native    = "${STAGING_DIR_NATIVE}"
D_SUBDIR:class-nativesdk = "/opt/${DISTRO}"

# SCR is the location and name of the Software Content Register file
# relative to ${D}${D_SUBDIR}.
SCR = "SCR.txt"

do_install () {
    install -d ${D}${D_SUBDIR}
    cp -r ${S}/* ${D}${D_SUBDIR}

    # Adjust for multilib and usrmerge
    # FIXME: This does not handle nonarch_base_libdir
    if [ -d "${D}/lib" ] && [ "/lib" != "${base_libdir}" ]; then
        install -d ${D}${base_libdir}
        mv ${D}/lib/* ${D}${base_libdir}
        rm -r ${D}/lib
    fi
    if [ -d "${D}/usr/lib" ] && [ "/usr/lib" != "${libdir}" ]; then
        install -d ${D}${libdir}
        mv ${D}/usr/lib/* ${D}${libdir}
        rm -r ${D}/usr/lib
    fi

    rm ${D}${D_SUBDIR}/COPYING
    if [ ! -f ${D}${D_SUBDIR}/${SCR} ]; then
        bbfatal "Missing Software Content Register \"${D}${D_SUBDIR}/${SCR}\""
    fi
    rm ${D}${D_SUBDIR}/${SCR}
}

FILES:${PN} = "/"
