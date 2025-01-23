SUMMARY = "i.MX GPU SDK Samples"
DESCRIPTION = "Set of sample applications for i.MX GPU"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://License.md;md5=f989c2fba947eb886cd6cb09cee89518"

DEPENDS = " \
    assimp \
    cmake-native \
    devil \
    gstreamer1.0 \
    gstreamer1.0-plugins-base \
    ninja-native \
    zlib \
    ${EMPTY_MAIN_PACKAGE_RECIPES} \
"
# Unfortunately, recipes with an empty main package, like header-only libraries,
# are not included in the SDK. Use RDEPENDS as a workaround.
EMPTY_MAIN_PACKAGE_RECIPES = " \
    fmt \
    gli \
    glm \
    gtest \
    half \
    nlohmann-json \
    pugixml \
    rapidjson \
    stb \
"
EMPTY_MAIN_PACKAGES = \
    "${@d.getVar('EMPTY_MAIN_PACKAGE_RECIPES').replace("gtest", "googletest")}"

SRC_URI = "${GPU_SDK_SRC};branch=${SRCBRANCH}"
GPU_SDK_SRC ?= "git://github.com/nxp-imx/gtec-demo-framework.git;protocol=https"
SRCBRANCH = "master"
SRCREV = "1f512be500cecb392b24a154e83f0e7cd4655f3e"

S = "${WORKDIR}/git"

inherit pkgconfig

PACKAGECONFIG ??= " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', \
       bb.utils.contains('DISTRO_FEATURES',     'x11',     'x11', \
                                                              '', d), d)} \
    ${PACKAGECONFIG_DRM} \
    ${PACKAGECONFIG_G2D} \
    ${PACKAGECONFIG_GLES} \
    ${PACKAGECONFIG_GPUTYPE} \
    ${PACKAGECONFIG_OPENVG} \
"

PACKAGECONFIG_DRM                          = ""
PACKAGECONFIG_DRM:imxdrm:imxmali           = "opencl opencv vulkan"
PACKAGECONFIG_DRM:imxdrm:imxviv            = "opencl opencv openvx vulkan"
PACKAGECONFIG_DRM:imxdrm:mx8mm-nxp-bsp     = "opencv"

PACKAGECONFIG_G2D                          = ""
PACKAGECONFIG_G2D:imxgpu2d                 = "g2d"

PACKAGECONFIG_GLES                         = ""
PACKAGECONFIG_GLES:imxgpu3d                = "gles2 gles3 gles32"
PACKAGECONFIG_GLES:imxgpu3d:mx6-nxp-bsp    = "gles2 gles3"
PACKAGECONFIG_GLES:imxgpu3d:mx7-nxp-bsp    = "gles2 gles3"
PACKAGECONFIG_GLES:imxgpu3d:mx7ulp-nxp-bsp = "gles2"
PACKAGECONFIG_GLES:imxgpu3d:mx8mm-nxp-bsp  = "gles2"

PACKAGECONFIG_GPUTYPE:imxmali              = "mali"
PACKAGECONFIG_GPUTYPE:imxviv               = "vivante"

PACKAGECONFIG_OPENVG                       = ""
PACKAGECONFIG_OPENVG:imxviv                = "openvg"

PACKAGECONFIG[g2d] = "G2D,,virtual/libg2d"
PACKAGECONFIG[gles2] = "OpenGLES2,,virtual/libgles2"
PACKAGECONFIG[gles3] = "OpenGLES3,,virtual/libgles3"
PACKAGECONFIG[gles32] = "OpenGLES3.2,,virtual/libgles3"
PACKAGECONFIG[mali] = ""
# RDEPENDS: rapidopencl is header-only
PACKAGECONFIG[opencl] = "OpenCL1.2,,rapidopencl,rapidopencl"
PACKAGECONFIG[opencv] = "OpenCV4,,opencv"
PACKAGECONFIG[openvg] = "OpenVG,,virtual/libopenvg"
# RDEPENDS: rapidopenvx is header-only
PACKAGECONFIG[openvx] = "OpenVX1.2,,rapidopenvx,rapidopenvx"
PACKAGECONFIG[vivante] = "HW_GPU_VIVANTE"
# RDEPENDS: rapidvulkan is header-only, vulkan-loader is dynamically loaded
PACKAGECONFIG[vulkan] = "Vulkan1.2,,glslang-native rapidvulkan vulkan-loader,rapidvulkan vulkan-loader"
PACKAGECONFIG[wayland] = ",,wayland-native wayland wayland-protocols,,,x11"
PACKAGECONFIG[x11] = ",,xrandr,,,wayland"

PACKAGECONFIG_CONFARGS = " \
    ConsoleHost \
    EarlyAccess \
    EGL \
    GoogleUnitTest \
    Lib_NlohmannJson \
    Lib_pugixml \
    Test_RequireUserInputToExit \
    WindowHost \
"

FEATURES = "${@','.join(d.getVar('PACKAGECONFIG_CONFARGS').split())}"

EXTENSIONS               = "*"
EXTENSIONS:mx6q-nxp-bsp  = "OpenGLES:GL_VIV_direct_texture,OpenGLES3:GL_EXT_geometry_shader,OpenGLES3:GL_EXT_tessellation_shader"
EXTENSIONS:mx6dl-nxp-bsp = "OpenGLES:GL_VIV_direct_texture,OpenGLES3:GL_EXT_geometry_shader,OpenGLES3:GL_EXT_tessellation_shader"
EXTENSIONS:mx8m-nxp-bsp  = "OpenGLES:GL_VIV_direct_texture,OpenGLES3:GL_EXT_color_buffer_float"
EXTENSIONS:mx8mm-nxp-bsp = "*"
EXTENSIONS:imxmali       = "OpenGLES3:GL_EXT_color_buffer_float,OpenGLES3:GL_EXT_geometry_shader,OpenGLES3:GL_EXT_tessellation_shader"

WINDOW_SYSTEM = \
    "${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'Wayland', \
        bb.utils.contains('DISTRO_FEATURES',     'x11',     'X11', \
                                                             'FB', d), d)}"

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

# See earlier comment
RDEPENDS:${PN} = "${EMPTY_MAIN_PACKAGES}"

# For backwards compatibility
RPROVIDES:${PN} = "fsl-gpu-sdk"
RREPLACES:${PN} = "fsl-gpu-sdk"
RCONFLICTS:${PN} = "fsl-gpu-sdk"

COMPATIBLE_MACHINE = "(imxgpu)"
