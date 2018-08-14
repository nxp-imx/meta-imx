# Use i.MX Kernel, U-Boot and Gstreamer 1.0 providers
PREFERRED_PROVIDER_virtual/bootloader_imx = "u-boot-imx"
#PREFERRED_PROVIDER_virtual/bootloader_mx6 = "u-boot-imx"
#PREFERRED_PROVIDER_virtual/bootloader_mx6ul = "u-boot-imx"
#PREFERRED_PROVIDER_virtual/bootloader_mx6sll = "u-boot-imx"
#PREFERRED_PROVIDER_virtual/bootloader_mx7d = "u-boot-imx"
#PREFERRED_PROVIDER_virtual/bootloader_mx7ulp = "u-boot-imx"

PREFERRED_PROVIDER_virtual/kernel_imx = "linux-imx"
#PREFERRED_PROVIDER_virtual/kernel_mx6 = "linux-imx"
#PREFERRED_PROVIDER_virtual/kernel_mx6ul = "linux-imx"
#PREFERRED_PROVIDER_virtual/kernel_mx6sll = "linux-imx"
#PREFERRED_PROVIDER_virtual/kernel_mx7d = "linux-imx"
#PREFERRED_PROVIDER_virtual/kernel_mx7ulp = "linux-imx"
#PREFERRED_PROVIDER_virtual/kernel_imx7ulp_zebu = "linux-imx"

PREFERRED_VERSION_linux-libc-headers_imx = "4.14"

MACHINE_GSTREAMER_1_0_PLUGIN_mx6ul = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6sll = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6q = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6dl = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6sl = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6sx = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx7d = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx7ulp = "imx-gst1.0-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx8 = "imx-gst1.0-plugin"

# Extra audio support
# Add support for ALL i.MX6/7/8 SoC families
MACHINE_EXTRA_RRECOMMENDS_append_imx = " ${@bb.utils.contains('DISTRO_FEATURES', 'alsa', 'imx-alsa-plugins', '', d)}"

# Default toolchains used in testing i.MX BSPs
DEFAULTTUNE_mx6   = "cortexa9hf-neon"
DEFAULTTUNE_mx6ul = "cortexa7hf-neon"
DEFAULTTUNE_mx6sll = "cortexa9hf-neon"
DEFAULTTUNE_mx7d   = "cortexa7hf-neon"
DEFAULTTUNE_mx7ulp = "cortexa7hf-neon"
DEFAULTTUNE_mx8 = "aarch64"

# Enable the kenrel loadable module as default
USE_GPU_VIV_MODULE = "1"

IMX_GPU_VERSION            ?= "6.2.4.p2.1"
IMX_GPU_VERSION_SUFFIX      = "aarch32"
IMX_GPU_VERSION_SUFFIX_mx8  = "aarch64"

PREFERRED_VERSION_imx-gpu-viv               = "${IMX_GPU_VERSION}-${IMX_GPU_VERSION_SUFFIX}"
PREFERRED_VERSION_xf86-video-imx-vivante    = "${IMX_GPU_VERSION}"
PREFERRED_VERSION_kernel-module-imx-gpu-viv = "${IMX_GPU_VERSION}"
PREFERRED_VERSION_imx-gpu-g2d               = "${IMX_GPU_VERSION}-${IMX_GPU_VERSION_SUFFIX}"

PREFERRED_VERSION_gstreamer1.0-plugins-base = "1.14.0.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-bad  = "1.14.0.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-good = "1.14.0.imx"
PREFERRED_VERSION_gstreamer1.0              = "1.14.0.imx"

# Use systemd as default init manager
VIRTUAL-RUNTIME_init_manager = "systemd"
PREFERRED_PROVIDER_udev = "systemd"
PREFERRED_PROVIDER_udev-utils = "systemd"
DISTRO_FEATURES_BACKFILL_CONSIDERED = "sysvinit"
IMX_DEFAULT_DISTRO_FEATURES += " systemd"

SOC_HAS_VIVANTE_KERNEL_DRIVER_SUPPORT_mx6 = "1"
SOC_HAS_VIVANTE_KERNEL_DRIVER_SUPPORT_mx7ulp = "1"

UBOOT_SUFFIX_mx6ul = "imx"
SPL_BINARY_mx6ul = ""
UBOOT_MAKE_TARGET_mx6ul = "u-boot.imx"

