SUMMARY = "i.MX GPU SDK Samples"
DESCRIPTION = "Set of sample applications for i.MX GPU"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://License.md;md5=9d58a2573275ce8c35d79576835dbeb8"

DEPENDS = "assimp devil fmt gstreamer1.0 gstreamer1.0-plugins-base gli \
           glm gtest half rapidjson stb tclap zlib"
DEPENDS_append = \
    "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', ' wayland', \
        bb.utils.contains('DISTRO_FEATURES',     'x11',  ' xrandr', \
                                                                '', d), d)}"
DEPENDS_append_imxgpu2d = " virtual/libg2d virtual/libopenvg"
DEPENDS_append_imxgpu3d = " virtual/libgles2"

DEPENDS_VULKAN       = ""
DEPENDS_VULKAN_mx8   = "glslang-native rapidvulkan vulkan-headers vulkan-loader"
DEPENDS_VULKAN_mx8mm = ""
DEPENDS_append       = " ${DEPENDS_VULKAN}"

DEPENDS_OPENCL       = ""
DEPENDS_OPENCL_mx8   = "rapidopencl"
DEPENDS_OPENCL_mx8mm = ""
DEPENDS_append       = " ${DEPENDS_OPENCL}"

DEPENDS_OPENVX       = ""
DEPENDS_OPENVX_mx8   = "rapidopenvx"
DEPENDS_OPENVX_mx8mm = ""
DEPENDS_append       = " ${DEPENDS_OPENVX}"

GPU_SDK_SRC ?= "git://github.com/nxpmicro/gtec-demo-framework.git;protocol=https"
GPU_SDK_SRC_BRANCH ?= "master"
SRC_URI = "${GPU_SDK_SRC};branch=${GPU_SDK_SRC_BRANCH}"
SRCREV = "5f508da40457bf46bc976b785fc9cdb84deec352" 

S = "${WORKDIR}/git"

BACKEND = \
    "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'Wayland', \
        bb.utils.contains('DISTRO_FEATURES',     'x11',     'X11', \
                                                             'FB', d), d)}"

FEATURES                  = "EGL,EarlyAccess,OpenVG"
FEATURES_append_imxgpu2d  = ",G2D"
FEATURES_append_imxgpu3d  = ",OpenGLES2"
FEATURES_append           = "${FEATURES_SOC}"

FEATURES_SOC       = ""
FEATURES_SOC_mx6q  = ",OpenGLES3"
FEATURES_SOC_mx6dl = ",OpenGLES3"
FEATURES_SOC_mx8   = ",OpenCV,Vulkan,OpenGLES3,OpenGLES3.1,OpenCL,OpenCL1.1,OpenCL1.2,OpenVX,OpenVX1.1"
FEATURES_SOC_mx8mm = ",OpenCV"

EXTENSIONS       = "*"
EXTENSIONS_mx6q  = "OpenGLES3:GL_EXT_geometry_shader,OpenGLES3:GL_EXT_tessellation_shader"
EXTENSIONS_mx6dl = "OpenGLES3:GL_EXT_geometry_shader,OpenGLES3:GL_EXT_tessellation_shader"
EXTENSIONS_mx8m  = "OpenGLES3:GL_EXT_color_buffer_float"
EXTENSIONS_mx8mm = "*"

do_compile () {
    export FSL_PLATFORM_NAME=Yocto
    export ROOTFS=${STAGING_DIR_HOST}
    . ./prepare.sh
    FslBuild.py -vvvvv -t sdk --UseFeatures [${FEATURES}] --UseExtensions [${EXTENSIONS}] --Variants [WindowSystem=${BACKEND}] --BuildThreads ${BB_NUMBER_THREADS} -- install
}

REMOVALS = " \
    GLES2/DeBayer \
    GLES2/DirectMultiSamplingVideoYUV \
    GLES3/DirectMultiSamplingVideoYUV \
"
REMOVALS_append_imxdpu = " \
    G2D/EightLayers \
"
REMOVALS_append_mx6q = " \
    GLES3/HDR02_FBBasicToneMapping \
    GLES3/HDR03_SkyboxTonemapping \
    GLES3/HDR04_HDRFramebuffer \
"
REMOVALS_append_mx6dl = " \
    GLES3/HDR02_FBBasicToneMapping \
    GLES3/HDR03_SkyboxTonemapping \
    GLES3/HDR04_HDRFramebuffer \
"

do_install () {
    install -d "${D}/opt/${PN}"
    cp -r ${S}/bin/* ${D}/opt/${PN}
    cd ${D}/opt/${PN}
    rm -rf ${REMOVALS}
    cd -
}

FILES_${PN} += "/opt/${PN}"
FILES_${PN}-dbg += "/opt/${PN}/*/*/.debug /usr/src/debug"
INSANE_SKIP_${PN} += "already-stripped rpaths"

RDEPENDS_VULKAN       = ""
RDEPENDS_VULKAN_mx8   = "vulkan-validationlayers vulkan-loader"
RDEPENDS_VULKAN_mx8mm = ""
RDEPENDS_${PN} += "${RDEPENDS_VULKAN}"

# For backwards compatibility
RPROVIDES_${PN} = "fsl-gpu-sdk"
RREPLACES_${PN} = "fsl-gpu-sdk"
RCONFLICTS_${PN} = "fsl-gpu-sdk"

# Compatible only with i.MX GPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
