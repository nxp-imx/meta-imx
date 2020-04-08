PREFERRED_PROVIDER_virtual/bootloader_imx = "u-boot-imx"
PREFERRED_PROVIDER_virtual/kernel_imx = "linux-imx"

PREFERRED_VERSION_linux-libc-headers_imx ?= "5.4"

IMX_GPU_VERSION            ?= "6.4.0.p2.4"
IMX_GPU_VERSION_SUFFIX      = "aarch32"
IMX_GPU_VERSION_SUFFIX_mx8  = "aarch64"

PREFERRED_VERSION_imx-gpu-viv               = "${IMX_GPU_VERSION}-${IMX_GPU_VERSION_SUFFIX}"
PREFERRED_VERSION_kernel-module-imx-gpu-viv = "${IMX_GPU_VERSION}"
PREFERRED_VERSION_imx-gpu-g2d               = "${IMX_GPU_VERSION}"

# Set the preffered provider for opencl-headers
PREFERRED_PROVIDER_opencl-headers_imx = "imx-gpu-viv"

PREFERRED_VERSION_gstreamer1.0-plugins-base = "1.16.1.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-bad  = "1.16.1.imx"
PREFERRED_VERSION_gstreamer1.0-plugins-good = "1.16.1.imx"
PREFERRED_VERSION_gstreamer1.0              = "1.16.1.imx"
PREFERRED_VERSION_gstreamer1.0-libav        = "1.16.1"

# Use systemd as default init manager
VIRTUAL-RUNTIME_init_manager = "systemd"
PREFERRED_PROVIDER_udev = "systemd"
PREFERRED_PROVIDER_udev-utils = "systemd"
DISTRO_FEATURES_BACKFILL_CONSIDERED = "sysvinit"
POKY_DEFAULT_DISTRO_FEATURES += " systemd"
