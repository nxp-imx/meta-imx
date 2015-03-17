SUMMARY = "Freescale GPU SDK Samples"
DESCRIPTION = "Set of sample applications for Freescale GPU"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=acdb807ac7275fe32f9f64992e111241"
DEPENDS = "${WL_DEPENDS} ${DFB_DEPENDS} "
DEPENDS_append_mx6q = " virtual/libgles2"
DEPENDS_append_mx6dl = " virtual/libgles2"
DEPENDS_append_mx6sx = " virtual/libgles2"

WL_DEPENDS = "${@base_contains('DISTRO_FEATURES', 'wayland', 'wayland', '', d)}"
DFB_DEPENDS =  "${@base_contains('DISTRO_FEATURES', 'directfb', 'directfb', '', d)}"

inherit fsl-eula-unpack

# For backwards compatibility
RPROVIDES_${PN} = "vivante-gpu-sdk"
RREPLACES_${PN} = "vivante-gpu-sdk"
RCONFLICTS_${PN} = "vivante-gpu-sdk"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "5186e17f2e00b1b4aabc61a22fe24488"
SRC_URI[sha256sum] = "c868963026c49bf4dfda9ff7abaf22bf441b7472aa7db3fbf81765a1a45edc1b"

S = "${WORKDIR}/${PN}-${PV}"

BACKEND = "${@base_contains('DISTRO_FEATURES', 'x11', 'X11', \
                    base_contains('DISTRO_FEATURES', 'wayland', 'Wayland', \
                           base_contains('DISTRO_FEATURES', 'fb', 'FB', 'DirectFB', d), d), d)}"
do_compile () {
     export FSL_GRAPHICS_SDK=${S}
     export ROOTFS=${STAGING_DIR_HOST}
    ./build.sh -f GNUmakefile_Yocto EGLBackend=${BACKEND}
}

do_install () {
   export FSL_GRAPHICS_SDK=${S}
   install -d "${D}/opt/${PN}"
  ./build.sh -f  GNUmakefile_Yocto EGLBackend=${BACKEND} install 
   cp -r bin/* "${D}/opt/${PN}"      
}

FILES_${PN} += "/opt/${PN}"
FILES_${PN}-dev = "/usr"
FILES_${PN}-dbg = "/opt/${PN}/*/.debug"
INSANE_SKIP_${PN} += "rpaths"
