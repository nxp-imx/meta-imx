require conf/distro/poky.conf

DISTRO = "imx-nxp"
DISTRO_NAME = "NXP i.MX Release Distro"
DISTRO_VERSION = "6.12-walnascar"
DISTROOVERRIDES = "fsl"

MAINTAINER = "NXP <lauren.post@nxp.com>"

POKY_DEFAULT_DISTRO_FEATURES:remove = "${POKY_DEFAULT_DISTRO_FEATURES_IMX_REMOVE}"
POKY_DEFAULT_DISTRO_FEATURES_IMX_REMOVE             ?= "wayland"
POKY_DEFAULT_DISTRO_FEATURES_IMX_REMOVE:mx6-nxp-bsp ?= "wayland vulkan"
POKY_DEFAULT_DISTRO_FEATURES_IMX_REMOVE:mx7-nxp-bsp ?= "wayland vulkan"
DISTRO_FEATURES:remove = "pulseaudio"

POKY_DEFAULT_DISTRO_FEATURES:append = " \
    qt \
    ${POKY_DEFAULT_DISTRO_FEATURES_IMX_APPEND}"
POKY_DEFAULT_DISTRO_FEATURES_IMX_APPEND             ?= "jailhouse xen"
POKY_DEFAULT_DISTRO_FEATURES_IMX_APPEND:mx6-nxp-bsp ?= ""
POKY_DEFAULT_DISTRO_FEATURES_IMX_APPEND:mx7-nxp-bsp ?= ""

DISTRO_FEATURES:append:mx8-nxp-bsp = " virtualization"
SKIP_META_VIRT_SANITY_CHECK = "1"

SKIP_META_SECURITY_SANITY_CHECK = "1"
SKIP_META_TPM_SANITY_CHECK = "1"

# Set a more generic tuning for code reuse across parts
DEFAULTTUNE:mx8-nxp-bsp    ?= "armv8a-crc-crypto"
DEFAULTTUNE:mx8m-nxp-bsp   ?= "armv8a-crc-crypto"
DEFAULTTUNE:mx8qm-nxp-bsp  ?= "armv8a-crc-crypto"
DEFAULTTUNE:mx8x-nxp-bsp   ?= "armv8a-crc-crypto"
DEFAULTTUNE:mx8ulp-nxp-bsp ?= "armv8a-crc-crypto"
DEFAULTTUNE:mx9-nxp-bsp    ?= "armv8a-crc-crypto"
DEFAULTTUNE:mx91-nxp-bsp   ?= "armv8a-crc-crypto"
DEFAULTTUNE:mx93-nxp-bsp   ?= "armv8a-crc-crypto"
DEFAULTTUNE:mx95-nxp-bsp   ?= "armv8a-crc-crypto"

# Use systemd as default init manager
POKY_INIT_MANAGER = "systemd"

# Use virtual-runc as a default container runtime
# runtime: runc, crun, runv, runx
VIRTUAL-RUNTIME_container_runtime = "virtual-runc"

PACKAGECONFIG:append:pn-gstreamer1.0-plugins-ugly = " x264"

PACKAGECONFIG:append:pn-mesa-demos = " ${@bb.utils.filter('DISTRO_FEATURES', 'wayland', d)}"
PACKAGECONFIG:remove:pn-mesa-demos = "vulkan"

PACKAGECONFIG:append:pn-perf = " jevents"

PACKAGECONFIG:append:pn-pulseaudio = " autospawn-for-root"

# For qtbase without GPU, gles2 is disabled by default due to poor performance.
# Enable it here in the distro for testing purposes.
PACKAGECONFIG:append:pn-qtbase:mx93-nxp-bsp = " gles2"
PACKAGECONFIG:remove:pn-qtbase:mx93-nxp-bsp = "no-opengl linuxfb"
PACKAGECONFIG:append:pn-qtbase:mx943-nxp-bsp = " gles2"
PACKAGECONFIG:remove:pn-qtbase:mx943-nxp-bsp = "no-opengl linuxfb"

PACKAGECONFIG:append:pn-qtquick3d:class-target = " examples"
PACKAGECONFIG:remove:pn-qtquick3d:class-target = "openxr"

PACKAGECONFIG:append:pn-qtwebengine:class-target = " examples"

# For bluealsa enable msbc in order to validate Bluetooth HFP profile with WBS.
# Supporting encode/decode of SCO packets with SBC codec
PACKAGECONFIG:append:pn-bluealsa = " msbc"
