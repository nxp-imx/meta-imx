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
DEPENDS_VULKAN_mx8   = "vulkan-headers rapidvulkan glslang-native"
DEPENDS_VULKAN_mx8mm = ""
DEPENDS_append       = " ${DEPENDS_VULKAN}"

DEPENDS_OPENCL       = ""
DEPENDS_OPENCL_mx8   = "rapidopencl"
DEPENDS_OPENCL_mx8mm = ""
DEPENDS_append       = " ${DEPENDS_OPENCL}"

DEPENDS_OPENVX       = ""
DEPENDS_OPENVX_mx8qm = "rapidopenvx"
DEPENDS_append       = " ${DEPENDS_OPENVX}"

GPU_SDK_SRC ?= "git://github.com/nxpmicro/gtec-demo-framework.git;protocol=https"
GPU_SDK_SRC_BRANCH ?= "master"
SRC_URI = "${GPU_SDK_SRC};branch=${GPU_SDK_SRC_BRANCH}"
SRCREV = "0447f708533bb2b1f2cfd9f06cb2570d5141915c"

S = "${WORKDIR}/git"

BACKEND = \
    "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'Wayland', \
        bb.utils.contains('DISTRO_FEATURES',     'x11',     'X11', \
                                                             'FB', d), d)}"

FEATURES_MX8   = ",OpenCV,Vulkan,OpenGLES3,OpenGLES3.1,OpenCL,OpenCL1.1,OpenCL1.2,OpenVX,OpenVX1.1"
FEATURES_MX8M  = ",OpenCV,Vulkan,OpenGLES3,OpenGLES3.1,OpenCL,OpenCL1.1,OpenCL1.2"
FEATURES_MX8MM = ",OpenCV"
FEATURES_MX8X  = ",OpenCV,Vulkan,OpenGLES3,OpenGLES3.1,OpenCL,OpenCL1.1,OpenCL1.2"
FEATURES                  = "EGL,EarlyAccess,OpenVG"
FEATURES_append_imxgpu2d  = ",G2D"
FEATURES_append_imxgpu3d  = ",OpenGLES2"
FEATURES_append_mx6q      = ",OpenGLES3"
FEATURES_append_mx6dl     = ",OpenGLES3"
FEATURES_append_mx8qm     = "${FEATURES_MX8}"
FEATURES_append_mx8mq     = "${FEATURES_MX8M}"
FEATURES_append_mx8mm     = "${FEATURES_MX8MM}"
FEATURES_append_mx8qxp    = "${FEATURES_MX8X}"

EXTENSIONS       = "*"
EXTENSIONS_mx8mq = "OpenGLES3:GL_EXT_color_buffer_float"

RECIPES          = "*"
RECIPES_append   = ",-Recipe.DevIL_1_8_0"
RECIPES_append   = ",-Recipe.fmt_4_0_0"
RECIPES_append   = ",-Recipe.gli_0_8_2_0"
RECIPES_append   = ",-Recipe.glm_0_9_8_5"
RECIPES_append   = ",-Recipe.googletest_1_8_1"
RECIPES_append   = ",-Recipe.half_1_12_0"
RECIPES_append   = ",-Recipe.RapidJSON_1_1_0"
RECIPES_append   = ",-Recipe.RapidOpenCL_1_1_0_1"
RECIPES_append   = ",-Recipe.RapidOpenVX_1_1_0"
RECIPES_append   = ",-Recipe.RapidVulkan_1_0_68_0a"
RECIPES_append   = ",-Recipe.stb_2_19_0_0"
RECIPES_append   = ",-Recipe.tclap_1_2_2"
RECIPES_append   = ",-Recipe.zlib_1_2_11"

do_compile () {
    export FSL_PLATFORM_NAME=Yocto
    export ROOTFS=${STAGING_DIR_HOST}
    . ./prepare.sh
    FslBuild.py -vvvvv -t sdk --UseFeatures [${FEATURES}] --UseExtensions [${EXTENSIONS}] --Variants [WindowSystem=${BACKEND}] --BuildThreads ${BB_NUMBER_THREADS} --Recipes [${RECIPES}] -- install
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

# For backwards compatibility
RPROVIDES_${PN} = "fsl-gpu-sdk"
RREPLACES_${PN} = "fsl-gpu-sdk"
RCONFLICTS_${PN} = "fsl-gpu-sdk"

# Compatible only with i.MX GPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
