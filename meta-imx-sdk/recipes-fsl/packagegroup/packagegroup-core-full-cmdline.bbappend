RDEPENDS:packagegroup-core-full-cmdline-sys-services:remove = "${RDEPENDS_IMX_REMOVE_NFS_SERVER}"

RDEPENDS:packagegroup-core-full-cmdline-extended:append = "\
    iproute2-tc \
"
RDEPENDS:packagegroup-core-full-cmdline-extended:mx95-nxp-bsp:append = "\
    iproute2-devlink \
"
# The default i.MX kernel config doesn't include NFS server support, but
# packagegroup-core-full-cmdline-sys-services includes it in the userspace.
RDEPENDS_IMX_REMOVE_NFS_SERVER ??= "nfs-utils"
