RDEPENDS:packagegroup-core-full-cmdline-extended:append = "${RDEPENDS_IMX_EXTENDED_APPEND}"
RDEPENDS_IMX_EXTENDED_APPEND ??= " \
    iproute2-bridge \
    iproute2-tc \
    ${RDEPENDS_IMX_EXTENDED_APPEND_SOC} \
"
RDEPENDS_IMX_EXTENDED_APPEND_SOC              ??= ""
RDEPENDS_IMX_EXTENDED_APPEND_SOC:mx95-nxp-bsp ??= "iproute2-devlink"

# The default i.MX kernel config doesn't include NFS server support, but
# packagegroup-core-full-cmdline-sys-services includes it in the userspace.
RDEPENDS:packagegroup-core-full-cmdline-sys-services:remove = "${RDEPENDS_IMX_REMOVE_NFS_SERVER}"
RDEPENDS_IMX_REMOVE_NFS_SERVER ??= "nfs-utils"
