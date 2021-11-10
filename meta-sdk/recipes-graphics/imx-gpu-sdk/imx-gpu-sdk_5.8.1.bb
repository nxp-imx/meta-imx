SUMMARY = "i.MX GPU SDK Samples"
DESCRIPTION = "Set of sample applications for i.MX GPU"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://License.md;md5=9d58a2573275ce8c35d79576835dbeb8"

DEPENDS_BACKEND = \
    "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', ' wayland', \
        bb.utils.contains('DISTRO_FEATURES',     'x11',  ' xrandr', \
                                                                '', d), d)}"
DEPENDS_MX8       = ""
DEPENDS_MX8:mx8   = " \
    glslang-native \
    rapidopencl \
    rapidopenvx \
    rapidvulkan \
    vulkan-headers \
    vulkan-loader \
"
DEPENDS_MX8:mx8mm = ""
DEPENDS = " \
    assimp \
    cmake-native \
    devil \
    fmt \
    gli \
    glm \
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
    gtest \
    half \
    ninja-native \
    nlohmann-json \
    rapidjson \
    stb \
    zlib \
    ${DEPENDS_BACKEND} \
    ${DEPENDS_MX8} \
"
DEPENDS:append:imxgpu2d = " virtual/libg2d virtual/libopenvg"
DEPENDS:append:imxgpu3d = " virtual/libgles2"

GPU_SDK_SRC ?= "git://github.com/nxpmicro/gtec-demo-framework.git;protocol=https"
GPU_SDK_SRC_BRANCH ?= "master"
SRC_URI = "${GPU_SDK_SRC};branch=${GPU_SDK_SRC_BRANCH}"
SRCREV = "fb908cb32966dc3b80168ef3509379ec71d89be3"
S = "${WORKDIR}/git"

BACKEND = \
    "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'Wayland', \
        bb.utils.contains('DISTRO_FEATURES',     'x11',     'X11', \
                                                             'FB', d), d)}"

FEATURES                  = "EarlyAccess,EGL,GoogleUnitTest,Lib_NlohmannJson,OpenVG"
FEATURES:append:imxgpu2d  = ",G2D"
FEATURES:append:imxgpu3d  = ",OpenGLES2"
FEATURES:append           = "${FEATURES_SOC}"

FEATURES_SOC              = ""
FEATURES_SOC:mx6q         = ",OpenGLES3"
FEATURES_SOC:mx6dl        = ",OpenGLES3"
FEATURES_SOC:mx8          = ",OpenCV,Vulkan,OpenGLES3.2,OpenCL1.2,OpenVX1.1"
FEATURES_SOC:mx8mm        = ",OpenCV"

EXTENSIONS       = "*"
EXTENSIONS:mx6q  = "OpenGLES3:GL_EXT_geometry_shader,OpenGLES3:GL_EXT_tessellation_shader"
EXTENSIONS:mx6dl = "OpenGLES3:GL_EXT_geometry_shader,OpenGLES3:GL_EXT_tessellation_shader"
EXTENSIONS:mx8m  = "OpenGLES3:GL_EXT_color_buffer_float"
EXTENSIONS:mx8mm = "*"

do_compile () {
    export FSL_PLATFORM_NAME=Yocto
    export ROOTFS=${STAGING_DIR_HOST}
    . ./prepare.sh
    FslBuild.py -vvvvv -t sdk --UseFeatures [${FEATURES}] --UseExtensions [${EXTENSIONS}] --Variants [WindowSystem=${BACKEND}] --BuildThreads ${BB_NUMBER_THREADS} -c install --CMakeInstallPrefix ${S}
}

REMOVALS = " \
    GLES2/DeBayer \
    GLES2/DirectMultiSamplingVideoYUV \
    GLES3/DirectMultiSamplingVideoYUV \
"
REMOVALS:append:imxdpu = " \
    G2D/EightLayers \
"
REMOVALS:append:mx6q = " \
    GLES3/HDR02_FBBasicToneMapping \
    GLES3/HDR03_SkyboxTonemapping \
    GLES3/HDR04_HDRFramebuffer \
"
REMOVALS:append:mx6dl = " \
    GLES3/HDR02_FBBasicToneMapping \
    GLES3/HDR03_SkyboxTonemapping \
    GLES3/HDR04_HDRFramebuffer \
"

do_install () {
    install -d "${D}/opt/${PN}"
    cp -r ${S}/bin/* ${D}/opt/${PN}
    for removal in ${REMOVALS}; do
        rm -rf ${D}/opt/${PN}/$removal
    done
}

FILES:${PN} += "/opt/${PN}"
FILES:${PN}-dbg += "/opt/${PN}/*/*/.debug /usr/src/debug"
INSANE_SKIP:${PN} += "already-stripped rpaths"

# Unfortunately recipes with an empty main package, like header-only libraries,
# are not included in the SDK. Use RDEPENDS as a workaround.
RDEPENDS_EMPTY_MAIN_PACKAGE = " \
    fmt \
    gli \
    glm \
    googletest \
    half \
    rapidjson \
    stb \
"
RDEPENDS_EMPTY_MAIN_PACKAGE_MX8       = ""
RDEPENDS_EMPTY_MAIN_PACKAGE_MX8:mx8   = " \
    rapidopencl \
    rapidopenvx \
    rapidvulkan \
"
RDEPENDS_EMPTY_MAIN_PACKAGE_MX8:mx8mm = ""
# vulkan-loader is dynamically loaded, so need to add an explicit
# dependency
RDEPENDS_VULKAN_LOADER       = ""
RDEPENDS_VULKAN_LOADER:mx8   = "vulkan-validationlayers vulkan-loader"
RDEPENDS_VULKAN_LOADER:mx8mm = ""
RDEPENDS:${PN} += " \
    ${RDEPENDS_EMPTY_MAIN_PACKAGE} \
    ${RDEPENDS_EMPTY_MAIN_PACKAGE_MX8} \
    ${RDEPENDS_VULKAN_LOADER} \
"

# For backwards compatibility
RPROVIDES:${PN} = "fsl-gpu-sdk"
RREPLACES:${PN} = "fsl-gpu-sdk"
RCONFLICTS:${PN} = "fsl-gpu-sdk"

COMPATIBLE_MACHINE = "(imxgpu)"
