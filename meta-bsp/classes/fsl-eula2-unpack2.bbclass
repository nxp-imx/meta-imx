# fsl-eula-unpack2.bbclass provides a mechanism for a) unpacking certain
# EULA-licensed archives downloaded by HTTP and b) handling the EULA
# acceptance.

inherit fsl-eula-unpack fsl-eula2

IMX_PACKAGE_VERSION = "${PV}"

SRC_URI = "${FSL_MIRROR}/${IMX_PACKAGE_NAME}.bin;fsl-eula=true"

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

    # Adjust for multilib
    if [ "${base_libdir}" != "/lib" ] && [ -d "${D}/lib" ]; then
        mv ${D}/lib ${D}${base_libdir}
    fi
    if [ "${libdir}" != "/usr/lib" ] && [ -d "${D}/usr/lib" ]; then
        mv ${D}/usr/lib ${D}${libdir}
    fi

    rm ${D}${D_SUBDIR}/COPYING
    if [ ! -f ${D}${D_SUBDIR}/${SCR} ]; then
        bbfatal "Missing Software Content Register \"${D}${D_SUBDIR}/${SCR}\""
    fi
    rm ${D}${D_SUBDIR}/${SCR}
}

FILES:${PN} = "/"
