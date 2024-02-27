SUMMARY = "i.MX GPU SDK Samples"
DESCRIPTION = "Set of sample applications for i.MX GPU"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://License.md;md5=9d58a2573275ce8c35d79576835dbeb8"

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
    pugixml \
    rapidjson \
    stb \
    zlib \
    ${DEPENDS_2D} \
    ${DEPENDS_3D} \
    ${DEPENDS_BACKEND} \
    ${DEPENDS_DRM} \
"
DEPENDS_2D = ""
DEPENDS_2D:imxgpu2d = " \
    virtual/libg2d \
    virtual/libopenvg \
"
DEPENDS_2D:mx95-nxp-bsp = " \
    virtual/libg2d \
"
DEPENDS_3D = ""
DEPENDS_3D:imxgpu3d = " \
    virtual/libgles2 \
"
DEPENDS_BACKEND = " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', ' wayland-native wayland wayland-protocols', \
       bb.utils.contains('DISTRO_FEATURES',     'x11', ' xrandr', \
                                                       '', d), d)} \
"
DEPENDS_DRM = ""
DEPENDS_DRM:imxdrm = " \
    glslang-native \
    opencv \
    rapidopencl \
    rapidopenvx \
    rapidvulkan \
    vulkan-headers \
    vulkan-loader \
"
DEPENDS_DRM:mx8mm-nxp-bsp = " \
    opencv \
"

SRC_URI = "${GPU_SDK_SRC};branch=${SRCBRANCH}"
GPU_SDK_SRC ?= "git://github.com/nxp-imx/gtec-demo-framework.git;protocol=https"
SRCBRANCH = "r6.2.4"
SRCREV = "7875ca6fd4c7962c7a0e7e40f891ab46fb79ee98"

S = "${WORKDIR}/git"

inherit pkgconfig

WINDOW_SYSTEM = \
    "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'Wayland_XDG', \
        bb.utils.contains('DISTRO_FEATURES',     'x11',         'X11', \
                                                                 'FB', d), d)}"

FEATURES = "ConsoleHost,EarlyAccess,EGL,GoogleUnitTest,Lib_NlohmannJson,Lib_pugixml,Test_RequireUserInputToExit,WindowHost"
FEATURES:append = "${FEATURES_GPU}${FEATURES_G2D}${FEATURES_3D}${FEATURES_SOC}"

FEATURES_GPU               = ",HW_GPU_VIVANTE,OpenVG"
FEATURES_GPU:mx95-nxp-bsp  = ""

FEATURES_G2D               = ""
FEATURES_G2D:imxgpu2d      = ",G2D"

FEATURES_3D                = ""
FEATURES_3D:imxgpu3d       = ",OpenGLES2"

FEATURES_SOC               = ""
FEATURES_SOC:mx6q-nxp-bsp  = ",OpenGLES3"
FEATURES_SOC:mx6dl-nxp-bsp = ",OpenGLES3"
FEATURES_SOC:mx8-nxp-bsp   = ",OpenCV4,Vulkan1.2,OpenGLES3.2,OpenCL1.2,OpenVX1.2"
FEATURES_SOC:mx8mm-nxp-bsp = ",OpenCV4"
FEATURES_SOC:mx95-nxp-bsp  = ",OpenCV4,Vulkan1.2,OpenGLES3.2,OpenCL1.2"

EXTENSIONS               = "*"
EXTENSIONS:mx6q-nxp-bsp  = "OpenGLES:GL_VIV_direct_texture,OpenGLES3:GL_EXT_geometry_shader,OpenGLES3:GL_EXT_tessellation_shader"
EXTENSIONS:mx6dl-nxp-bsp = "OpenGLES:GL_VIV_direct_texture,OpenGLES3:GL_EXT_geometry_shader,OpenGLES3:GL_EXT_tessellation_shader"
EXTENSIONS:mx8m-nxp-bsp  = "OpenGLES:GL_VIV_direct_texture,OpenGLES3:GL_EXT_color_buffer_float"
EXTENSIONS:mx8mm-nxp-bsp = "*"
EXTENSIONS:mx95-nxp-bsp  = "OpenGLES3:GL_EXT_color_buffer_float,OpenGLES3:GL_EXT_geometry_shader,OpenGLES3:GL_EXT_tessellation_shader"

do_compile () {
    export FSL_PLATFORM_NAME=Yocto
    export ROOTFS=${STAGING_DIR_HOST}
    export FSL_HOST_ROOTFS=${STAGING_DIR_NATIVE}
    . ./prepare.sh
    FslBuild.py -vvvvv -t sdk -c install \
        --BuildThreads ${@oe.utils.parallel_make(d)} \
        --CMakeInstallPrefix ${S} \
        --UseFeatures [${FEATURES}] \
        --UseExtensions [${EXTENSIONS}] \
        --Variants [WindowSystem=${WINDOW_SYSTEM}]
}

REMOVALS = " \
    GLES2/DeBayer \
    GLES2/DirectMultiSamplingVideoYUV \
    GLES3/DirectMultiSamplingVideoYUV \
"
REMOVALS:append:imxdpu = " \
    G2D/EightLayers \
"
REMOVALS:append:mx6q-nxp-bsp = " \
    GLES3/HDR02_FBBasicToneMapping \
    GLES3/HDR03_SkyboxTonemapping \
    GLES3/HDR04_HDRFramebuffer \
"
REMOVALS:append:mx6dl-nxp-bsp = " \
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

RDEPENDS:${PN} += " \
    ${RDEPENDS_EMPTY_MAIN_PACKAGE} \
    ${RDEPENDS_VULKAN_LOADER}"
# Unfortunately recipes with an empty main package, like header-only libraries,
# are not included in the SDK. Use RDEPENDS as a workaround.
RDEPENDS_EMPTY_MAIN_PACKAGE = " \
    fmt \
    gli \
    glm \
    googletest \
    half \
    nlohmann-json \
    pugixml \
    rapidjson \
    stb \
    ${RDEPENDS_EMPTY_MAIN_PACKAGE_SOC}"
RDEPENDS_EMPTY_MAIN_PACKAGE_SOC = ""
RDEPENDS_EMPTY_MAIN_PACKAGE_SOC:mx8-nxp-bsp   = " \
    rapidopencl \
    rapidopenvx \
    rapidvulkan"
RDEPENDS_EMPTY_MAIN_PACKAGE_SOC:mx8mm-nxp-bsp = ""
RDEPENDS_EMPTY_MAIN_PACKAGE_SOC:mx95-nxp-bsp = " \
    rapidopencl \
    rapidvulkan"
# vulkan-loader is dynamically loaded, so need to add an explicit
# dependency
RDEPENDS_VULKAN_LOADER = ""
RDEPENDS_VULKAN_LOADER:mx8-nxp-bsp = " \
    vulkan-loader"
RDEPENDS_VULKAN_LOADER:mx8mm-nxp-bsp = ""
RDEPENDS_VULKAN_LOADER:mx95-nxp-bsp = " \
    vulkan-loader"

# For backwards compatibility
RPROVIDES:${PN} = "fsl-gpu-sdk"
RREPLACES:${PN} = "fsl-gpu-sdk"
RCONFLICTS:${PN} = "fsl-gpu-sdk"

COMPATIBLE_MACHINE = "(imxgpu)"
