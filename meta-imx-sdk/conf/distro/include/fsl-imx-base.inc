require conf/distro/poky.conf

DISTRO_VERSION = "6.18-wrynose"
DISTROOVERRIDES = "fsl"

MAINTAINER = "NXP <lauren.post@nxp.com>"

DISTRO_FEATURES:append = " opencl pam"
DISTRO_FEATURES:remove = "pulseaudio"

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
DEFAULTTUNE:mx9-nxp-bsp    ?= "armv8-2a-crypto"
DEFAULTTUNE:mx91-nxp-bsp   ?= "armv8-2a-crypto"
DEFAULTTUNE:mx93-nxp-bsp   ?= "armv8-2a-crypto"
DEFAULTTUNE:mx943-nxp-bsp  ?= "armv8-2a-crypto"
DEFAULTTUNE:mx95-nxp-bsp   ?= "armv8-2a-crypto"

# Use systemd as default init manager
POKY_INIT_MANAGER = "systemd"

# Use virtual-runc as a default container runtime
# runtime: runc, crun, runv, runx
VIRTUAL-RUNTIME_container_runtime = "virtual-runc"

IMX_MALI_DRIVERS ??= "mali-imx mesa"

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

PACKAGECONFIG:remove:pn-qtquick3d:class-target = "openxr"

# For bluealsa enable msbc in order to validate Bluetooth HFP profile with WBS.
# Supporting encode/decode of SCO packets with SBC codec
PACKAGECONFIG:append:pn-bluealsa = " msbc"

TOOLCHAIN_HOST_TASK:append = " \
    nativesdk-binutils \
    nativesdk-gcc nativesdk-gcc-symlinks \
    nativesdk-gnutls-dev \
"
