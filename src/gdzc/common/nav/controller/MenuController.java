package gdzc.common.nav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {
	@RequestMapping("/loadPage")
	public String loadPage(String id) {
		if (id != null) {
			switch (id) {
			case "index":
				return "index-content";
			case "nav":
				return "nav";
			case "nav2":
				return "nav2";
			case "detail":
				return "tabs";

			case "add-baseinfo":
				return "base/info/add";
			case "add-network-config":
				return "/equipment/network/config/add";
			case "add-network-net":
				return "/equipment/network/net/add";
			case "add-network-port":
				return "/equipment/network/port/add";
			case "add-storage-config":
				return "/equipment/storage/config/add";
			case "add-storage-net":
				return "/equipment/storage/net/add";
			case "add-storage-fiber":
				return "/equipment/storage/fiber/add";
			case "add-storage-spacemapping":
				return "/equipment/storage/space-mapping/add";
			case "add-server-config":
				return "/equipment/server/config/add";
			case "add-server-net":
				return "/equipment/server/net/add";
			case "add-server-storage-info":
				return "/equipment/server/storage-info/add";
			case "add-server-storage-mount":
				return "/equipment/server/storage-mount/add";
			case "add-server-backup":
				return "/equipment/server/backup/add";
			case "add-safe-config":
				return "/equipment/safe/config/add";
			case "add-safe-interface":
				return "/equipment/safe/interface/add";
			case "add-safe-nat":
				return "/equipment/safe/nat/add";
			case "add-safe-net":
				return "/equipment/safe/net/add";
			case "add-safe-access-control":
				return "/equipment/safe/access-control/add";
			case "add-video-config":
				return "/equipment/video/config/add";
			case "add-video-interface":
				return "/equipment/video/interface/add";
			case "add-video-net":
				return "/equipment/video/net/add";
			
			case "network-info":
				return "/equipment/network/info";	
			case "storage-info":
				return "/equipment/storage/info";	
			case "server-info":
				return "/equipment/server/info";	
			case "safe-info":
				return "/equipment/safe/info";	
			case "video-info":
				return "/equipment/video/info";
			case "base-info":
				return "/equipment/base/info";
				
			case "baseinfo-tab":
				return "/base/info/detail";
			case "network-config-tab":
				return "/equipment/network/config/detail";
			case "network-port-tab":
				return "/equipment/network/port/detail";
			case "storage-config-tab":
				return "/equipment/storage/config/detail";
			case "storage-net-tab":
				return "/equipment/storage/net/detail";
			case "storage-fiber-tab":
				return "/equipment/storage/fiber/detail";
			case "storage-spacemapping-tab":
				return "/equipment/storage/space-mapping/detail";
			case "server-config-tab":
				return "/equipment/server/config/detail";
			case "server-net-tab":
				return "/equipment/server/net/detail";
			case "server-storage-info-tab":
				return "/equipment/server/storage-info/detail";
			case "server-storage-mount-tab":
				return "/equipment/server/storage-mount/detail";
			case "server-backup-tab":
				return "/equipment/server/backup/detail";
			case "safe-config-tab":
				return "/equipment/safe/config/detail";
			case "safe-interface-tab":
				return "/equipment/safe/interface/detail";
			case "safe-nat-tab":
				return "/equipment/safe/nat/detail";
			case "safe-net-tab":
				return "/equipment/safe/net/detail";
			case "safe-access-control-tab":
				return "/equipment/safe/access-control/detail";
			case "video-config-tab":
				return "/equipment/video/config/detail";
			case "video-interface-tab":
				return "/equipment/video/interface/detail";
			case "video-net-tab":
				return "/equipment/video/net/detail";
				
			case "network":
				return "/equipment/network/network";
			case "router":
				return "/equipment/network/router";
			case "switch":
				return "/equipment/network/switch";
			case "fiber":
				return "/equipment/network/fiber";
			case "network-other":
				return "/equipment/network/other";
			case "storage":
				return "/equipment/storage/storage";
			case "server":
				return "/equipment/server/server";
			case "database":
				return "/equipment/server/database";
			case "application":
				return "/equipment/server/application";
			case "vitual":
				return "/equipment/server/vitual";
			case "server-other":
				return "/equipment/server/other";
			case "safe":
				return "/equipment/safe/safe";
			case "firewall":
				return "/equipment/safe/firewall";
			case "ca":
				return "/equipment/safe/ca";
			case "safe-other":
				return "/equipment/safe/other";
			case "video":
				return "/equipment/video/video";
			case "base":
				return "/equipment/base/base";
			case "fresh-air":
				return "/equipment/base/fresh-air/detail";
			case "ups":
				return "/equipment/base/ups/detail";
			case "refrigerat":
				return "/equipment/base/refriger/detail";
			case "fire-fight":
				return "/equipment/base/fire-fight/detail";
			case "distribute":
				return "/equipment/base/distribute/detail";
			case "other":
				return "/equipment/base/other/detail";
			}
		}
		return "coming";
	}
}
