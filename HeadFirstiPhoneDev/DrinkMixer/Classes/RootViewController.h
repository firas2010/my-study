//
//  RootViewController.h
//  DrinkMixer
//
//  Created by suguni on 11. 5. 28..
//  Copyright 2011 다음 커뮤니케이션. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface RootViewController : UITableViewController {
	NSMutableArray* drinks;
}

@property (nonatomic, retain) NSMutableArray* drinks;

@end