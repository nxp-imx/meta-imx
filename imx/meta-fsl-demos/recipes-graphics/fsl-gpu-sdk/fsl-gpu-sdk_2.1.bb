SUMMARY = "Freescale GPU SDK Samples"
DESCRIPTION = "Set of sample applications for Freescale GPU"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=cf7b2a944fc10cd1e2471a89ea6b7585"
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

SRC_URI[md5sum] = "7d674f4533c3ada096d65bb1c5aa339b"
SRC_URI[sha256sum] = "2be4e02b3a304ec22d4d763b4923977ac20983d1b56e7254cb6a72bd6eb36b31"

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
